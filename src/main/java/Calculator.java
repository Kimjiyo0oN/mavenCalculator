import java.io.*;


public class Calculator {


  public static float plus(float result, float num2) {
    return result+num2;
  }


  public static float minus(float result, float num2) {
    return result-num2;
  }


  public static float divide(float result, float num2) {
    return result/num2;
  }


  public static float Multi(float result, float num2) {
    return result*num2;
  }


  public static float remainder(float result, float num2) {
    return result%num2;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    float num1;
    float num2;
    float result =0;
    String symbol;
    int flag =0;
    while(true){
      if(flag == 2){
        System.out.print("계산 초기화하시겠습니까?(1. 초기화 2. 이어서):");
        flag = Integer.parseInt(br.readLine());
        result = (flag == 1) ? 0 : result;
      }
      if(flag != 2){
        flag =0;
        System.out.print("숫자를 입력해주세요:");
        result= Float.parseFloat(br.readLine());
      }
      num1 = result;
      System.out.print("수학 기호를 입력해주세요(+,-,*,/,%만 가능)");
      symbol = br.readLine().trim();
      System.out.print("숫자를 입력해주세요:");
      num2 = Float.parseFloat(br.readLine());
      switch (symbol){
        case "+":
          result = plus(result,num2);
          break;
        case "-":
          result = minus(result,num2);
          break;
        case "/":
          result = divide(result,num2);
          break;
        case "*":
          result = Multi(result,num2);
          break;
        case "%":
          result = remainder(result,num2);
          break;
        default:
          flag = -1;
          System.out.print("잘못입력하셨습니다.");
          break;
      }
      if(flag == -1) continue;
      System.out.print(num1 +symbol+num2+" = " + result+"\n");
      System.out.print("계산기를 종료하시겠습니까?(1. 예 , 2. 아니오): ");
      flag = Integer.parseInt(br.readLine());
      if(flag == 1) break;
    }

    br.close();
  }
}
