package pluginspractice

class PluginsController {
    def mailSenderService

    def index() { }
    def sendmail(){
        String s = mailSenderService.send()
        render view: "mailview"
    }
}
