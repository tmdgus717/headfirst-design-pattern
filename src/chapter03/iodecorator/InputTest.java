package chapter03.iodecorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

    public static void main(String[] args) throws IOException {
        int c;

        InputStream in = new LowerCaseInputStream(
            new BufferedInputStream(new FileInputStream("./test.txt")));

        //스트림 끝 도달: 스트림의 끝에 도달하면 in.read()는 -1을 반환합니다.
        //이를 통해 프로그램은 스트림의 모든 데이터를 읽었음을 알 수 있습니다.
        while ((c = in.read()) >= 0) {
            System.out.print((char)c);
        }
    }

}
