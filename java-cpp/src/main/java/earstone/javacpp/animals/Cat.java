package earstone.javacpp.animals;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Cat extends Animal {

    private int mAge;
    private String mName;

    @Builder
    public Cat(int age, String name) {
        super(age);
        this.mAge = age;
        this.mName = name;
    }

}
