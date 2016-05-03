package com.jd.aliday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class App 
{
   /* public static void main( String[] args )
    {
    	TaobaoClient client = new DefaultTaobaoClient("http://gw.api.taobao.com/router/rest", "23353561", "bf716fd7cb4e8d017c23673f1a804992");
    	AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
    	req.setSmsType("normal");
    	req.setSmsFreeSignName("注册验证");
    	req.setSmsParam("{\"code\":\"1234\",\"product\":\"xiexie\"}");
    	req.setRecNum("15026864207");
    	req.setSmsTemplateCode("SMS_8185910");
    	try {
			AlibabaAliqinFcSmsNumSendResponse response = client.execute(req);
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }*/
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
