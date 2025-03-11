package chapter02.subjects;

import chapter02.observers.Observer;

public interface Subject {
    
    void registerObserver(Observer observer); //옵저버 등록

    void removeObserver(Observer observer); //옵저버 제거

    void notifyObservers(); //주제의 상태가 변경되었을 때 모든 옵저버에게 변경 내용을 알리는 메서드
}
