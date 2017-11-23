package pluginspractice



class MailJob {
    def mailSenderService
    static triggers = {
//        simple startDelay: 30000, repeatInterval: 5000
        cron cronExpression = "0/6 0 18 * * ?"
    }

    def execute() {
        println "hi"
//        mailSenderService.send()
   }
}
