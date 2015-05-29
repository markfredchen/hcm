package com.mcworkshop.hcm.wechat;

import com.mcworkshop.hcm.wechat.aes.AesException;
import com.mcworkshop.hcm.wechat.aes.WXBizMsgCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by markfredchen on 5/27/15.
 */
@Controller
public class WeChatEntryPoint {

    @Autowired
    Environment env;

    @RequestMapping(value = "/weChat", method = RequestMethod.GET)
    @ResponseBody
    public String check(
        @RequestParam("msg_signature") String signature,
        @RequestParam("echostr") String echostr,
        @RequestParam("timestamp") String timestamp,
        @RequestParam("nonce") String nonce) throws AesException {
        return new WXBizMsgCrypt(env.getProperty("wechat.token"), env.getProperty("wechat.aeskey"), env.getProperty("wechat.corpid")).VerifyURL(signature, timestamp, nonce, echostr);
    }

    @RequestMapping(value = "/weChat", method = RequestMethod.POST)
    public @ResponseBody
    String post(@RequestBody String requestBody,
                @RequestParam("msg_signature") String signature,
                @RequestParam("timestamp") String timestamp,
                @RequestParam("nonce") String nonce) throws AesException {
        System.out.println(new WXBizMsgCrypt(env.getProperty("wechat.token"), env.getProperty("wechat.aeskey"), env.getProperty("wechat.corpid")).DecryptMsg(signature, timestamp, nonce, requestBody));
        System.out.println(requestBody);
        return "";
    }
}
