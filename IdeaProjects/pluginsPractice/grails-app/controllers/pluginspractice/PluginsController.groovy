package pluginspractice

class PluginsController {

    def index() { }
    def sendmail(){
        sendMail{

           to("harish@nexthoughts.com")
           subject("This is a test mail")
           body("..")
            render html(view:"mailview",model: [name:"Harish Singh Bisht"])
            //render view:"mailview"
        }
    }
}
