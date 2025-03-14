## 데코레이터 패턴에서 왜 구성 요소를 확장해야해? 휘핑크림은 음료가 아닌데

좋은 질문입니다. 데코레이터 패턴에서 구성 요소를 확장해야 하는 이유와 휘핑크림이 음료가 아닌 것에 대한 의문은 데코레이터 패턴의 핵심을 이해하는 데 중요한 포인트입니다.

**데코레이터 패턴에서 구성 요소를 확장해야 하는 이유:**

데코레이터 패턴은 기존 객체의 인터페이스를 변경하지 않고 기능을 동적으로 추가하기 위해 사용됩니다. 여기서 핵심은 "기존 객체의 인터페이스를 변경하지 않는다"는 점입니다. 데코레이터는 기존 객체를 감싸는 래퍼 역할을 하며, 감싸는 객체와 동일한 인터페이스를 구현해야 합니다.

만약 데코레이터가 기존 객체의 인터페이스를 구현하지 않는다면, 데코레이터는 기존 객체와 호환되지 않게 됩니다. 즉, 데코레이터를 기존 객체처럼 사용할 수 없게 되는 것이죠. 데코레이터 패턴의 장점은 기존 객체를 사용하는 코드의 변경 없이 데코레이터를 적용할 수 있다는 점인데, 인터페이스를 구현하지 않으면 이 장점을 활용할 수 없습니다.

**휘핑크림은 음료가 아닌 것에 대한 의문:**

휘핑크림은 음료 자체가 아니라 음료에 추가되는 첨가물입니다. 데코레이터 패턴에서 휘핑크림은 음료에 기능을 추가하는 데코레이터 역할을 합니다. 데코레이터는 기존 객체(음료)에 새로운 책임을 추가하지만, 기존 객체의 본질을 변경하지는 않습니다. 즉, 휘핑크림은 음료의 종류를 바꾸는 것이 아니라, 음료에 맛과 질감을 더하는 역할을 하는 것이죠.

데코레이터 패턴에서 중요한 것은 데코레이터가 구성 요소와 동일한 인터페이스를 구현해야 한다는 점입니다. 음료 인터페이스에는 `getDescription()` (설명 반환) 및 `cost()` (가격 반환) 과 같은 메소드가 있을 수 있습니다. 휘핑크림 데코레이터는 이러한 메소드를 구현하여 음료의 설명에 "휘핑크림"을 추가하고 가격에 휘핑크림 가격을 더합니다.

**정리:**

*   데코레이터 패턴에서 구성 요소를 확장해야 하는 이유는 데코레이터가 기존 객체와 동일한 인터페이스를 구현하여 호환성을 유지하고, 기존 객체를 사용하는 코드의 변경 없이 데코레이터를 적용할 수 있도록 하기 위함입니다.
*   휘핑크림은 음료 자체가 아니라 음료에 추가되는 첨가물이며, 데코레이터 패턴에서 데코레이터는 기존 객체에 새로운 책임을 추가하지만, 기존 객체의 본질을 변경하지는 않습니다.

데코레이터 패턴은 객체지향 설계의 유연성을 높이는 강력한 도구입니다. 데코레이터 패턴을 올바르게 이해하고 활용하면 코드의 재사용성을 높이고 유지보수를 용이하게 할 수 있습니다.
