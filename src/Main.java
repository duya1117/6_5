public class Main {
    public static void main(String[] args) {
//        String color = "노랑";
//
//        String choiceColor = (color == "빨강") ? "빨강" : (color == "파랑") ? "파랑" : (color == "보라") ? "보라" : "초록";
//
//        System.out.println(choiceColor);

        String color = "빨강";
        if (color == "빨강") {
            System.out.println("빨강");
        }else if(color == "파랑"){
            System.out.println("파랑");
        }else if(color == "보라"){
            System.out.println("보라");
        }else {
            System.out.println("초록");
        }
    }
}