package fr.uppa.platscuisines;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by mbsanchez on 24/02/2018.
 */

@Singleton
@Component(modules = {AppModule.class})
public interface DataComponent {
    void inject(MainActivity mainActivity);
    void inject(DishViewActivity mainActivity);
}
