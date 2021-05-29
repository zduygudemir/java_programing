package day24_loops;

public class YoutubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        int seconds = 0;

        while(seconds <=117){
            System.out.println("starting: World's smallest cat \uD83D\uDC08-BBC "+seconds);
            seconds++;
            Thread.sleep(1000);
        }
        System.out.println("Finish watching cat \uD83D\uDC08-BBC  video");
        System.out.println("lets start another one  ");
    }
}
