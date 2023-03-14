package cx.catapult.animals.service;

import cx.catapult.animals.domain.Animal;
import java.util.Collection;

public interface Service<T extends Animal> {

    Collection<T> all();

    T create(T animal);

    T get(String id);

    T delete(String id);

}
