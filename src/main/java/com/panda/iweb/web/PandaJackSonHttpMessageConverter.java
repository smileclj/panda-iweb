package com.panda.iweb.web;

import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import com.panda.iweb.common.resp.JsonpResult;
import com.panda.iweb.util.JsonUtil;
import com.panda.iweb.util.common.StringUtil;

public class PandaJackSonHttpMessageConverter extends MappingJackson2HttpMessageConverter {

    @Override
    protected void writeInternal(Object obj, HttpOutputMessage outputMessage) throws IOException,
                                                                             HttpMessageNotWritableException {
        if (obj instanceof JsonpResult) {
            JsonpResult jsonp = (JsonpResult) obj;
            PrintWriter pw = new PrintWriter(outputMessage.getBody());
            String body = JsonUtil.toJsonString(jsonp.getResult());
            if (StringUtil.isNotEmpty(jsonp.getMethod())) {
                pw.write(jsonp.getMethod() + "(" + body + ")");
            } else {
                pw.write(body);
            }
            pw.flush();
        } else {
            super.writeInternal(obj, outputMessage);
        }
    }
}
