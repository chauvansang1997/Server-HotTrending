/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.server_hottrending;


import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.NicelyResynchronizingAjaxController;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.WebRequest;
import com.gargoylesoftware.htmlunit.html.DomElement;
import com.gargoylesoftware.htmlunit.html.HtmlDivision;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;
import java.net.URL;




/**
 *
 * @author chauvansang
 */
public class server {
    
    private static  String test;
    private static  String id;
      private static  HtmlDivision division;
    public static boolean checkReponse(HtmlPage page)
    {
        
        try
        {
           String temp=page.getElementById("trending-stories-header").asText();
           
           division=page.getHtmlElementById("trending-stories-header");
           id=temp;
        }
        catch(Exception ex)
        {
            return false;
        }
        return true;
    }
    public static void submittingForm() throws Exception {
       WebClient webClient = new WebClient();
        webClient.getOptions().setJavaScriptEnabled(true);
        webClient.getOptions().setThrowExceptionOnScriptError(false);
        webClient.setAjaxController(new NicelyResynchronizingAjaxController()); 

        WebRequest request = new WebRequest(new URL("https://trends.google.com.vn/trends/"));
        HtmlPage page = webClient.getPage(request);
        while(!checkReponse(page))
        {
            
        }
       // while()
//        int i = webClient.waitForBackgroundJavaScript(1000);
//
//        while (i > 0)
//        {
//            i = webClient.waitForBackgroundJavaScript(1000);
//
//            if (i == 0)
//            {
//                break;
//            }
//            synchronized (page) 
//            {
//                System.out.println("wait");
//                System.out.println(page.asText());
//                page.wait(500);
//            }
//        }

       // webClient.getAjaxController().processSynchron(page, request, false  
       System.out.println(page.asText());
    }
    public static String  getUpdatedRespose(HtmlPage page,WebClient client){
       while (page.getElementById("USNOclk").asText() == "Loading...") {
      client.waitForBackgroundJavaScript(200);
        }
       return page.getElementById("USNOclk").asText();
    }
     public static void main(String[] args) throws Exception {
       //submittingForm();
        System.out.println("OK tahnh con");
    }
}
