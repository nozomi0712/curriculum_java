/**
 * Task1-3 : 課題内容
 *
 * 本課題では、演算子の使い方を学んでいきましょう。
 * 問①から問⑦まであります。
 * 指定された数値、式、変数名を守って記述してください。
 *
 * 問③,⑤については、コメントを入れてください。
 * 問⑦については、変数名を使って出力してください。
 *
 */
public class Task1_3 {
    public static void main(String[] args) {
        // ① 5 と 10 を加算した値を代入する、変数 plus を作成しなさい。
        int plus = 5 + 10;
        System.out.println(plus);
        // ② 20 から 7 を減算した値を代入する、変数 minus を作成しなさい。
        int minus = 20 -7;
        System.out.println(minus);
        // ③下記の処理について、何をしているのかコメントを記入してください。
        // [int型の変数multiplyに（10×2の）商の返り値を代入している]
        int multiply = 10 * 2;
        System.out.println(multiply);
        // ④ 20 を 6 で割った余りを代入する、変数 remi を作成しなさい。
        int remi = 20 % 6;
        System.out.println(remi);
        // ⑤下記の処理について、何をしているのかコメントを記入してください
        // [String型の変数town,lineに文字列を代入している]
        String town = "有楽町";
        String line = "線";
        // ⑥ ⑤で作成した変数を連結させた値を代入する変数 train を作成しなさい。
        String train = town + line;
        System.out.println(train);
        // ⑦ 変数plus, minus, multiply, remi, train をそれぞれ出力しなさい。

    }
}