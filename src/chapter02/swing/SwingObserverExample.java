package chapter02.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    JFrame jFrame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        jFrame = new JFrame();
        JButton button = new JButton("할까?말까?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());


        jFrame.add(button);  // 🔥 버튼을 JFrame에 추가
        jFrame.setSize(300, 200);  // 🔥 창 크기 설정
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 🔥 닫기 버튼 설정
        jFrame.setVisible(true);  // 🔥 화면 표시
    }
    
    class AngelListener implements ActionListener{ //옵저버 클래스의 정의

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("하지 마! 아마 후회할 걸?");
        }
    }

    class DevilListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("그냥 저질러 버렷!!");
        }
    }

}
