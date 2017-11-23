package pluginspractice

import grails.transaction.Transactional

@Transactional
class MailSenderService {
    def mailService
    def serviceMethod() {

    }
    String send(){
        mailService.sendMail{

            to("harish@nexthoughts.com")
            subject("This is a test mail")
            body("hi this is a test mail")
            //render html(view:"mailview",model: [name:"Harish Singh Bisht"])
            //render view:"mailview"
        }
        return "test"
    }
}
