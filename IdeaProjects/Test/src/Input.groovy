class Input {
    static int attempts=0
    void startPlay(int num){

        Scanner inn = new Scanner(System.in)
        Random random = new Random();
        int renNum = random.nextInt(1)
        println renNum
        if(renNum==num){
            println "Congratulations...You Have Hit The Bulls Eye In $attempts"
        }
        else{
            attempts++
            println "Try Again...Choose Y/N"
            String ch = inn.next()
            switch (ch){
                case "y":
                    println "Guess Number.."
                    int n = inn.nextInt();
                    startPlay(n);
                    break;
                case "n":
                    println "Bye"
                    break
                default:
                    println "Invalid Key"
                    break;
            }

        }
    }
    static void main(agrs){
        Scanner sc = new Scanner(System.in)
        println "Guess Then Number In Between 1-10"
        int num = sc.nextInt();
        Input input= new Input();
        input.startPlay(num);
    }
}
