package posttweet.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;

@Controller
public class MyWebController {

    @RequestMapping("/test")
    @ResponseBody
    public String handle () {
        Twitter twitter = TwitterFactory.getSingleton();
        Status status = null;
        try {
            status = twitter.updateStatus("creating baeldung API");
        } catch (Exception e) {
        }
        return status.getText();
    }

    @RequestMapping("/test2")
    @ResponseBody
    public String handle2 () {
        return "test response from /test2";
    }
}