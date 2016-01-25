package edu.galileo.android.twitterclient.hashtags;

import javax.inject.Singleton;

import dagger.Component;
import edu.galileo.android.twitterclient.TwitterAppModule;
import edu.galileo.android.twitterclient.lib.LibsModule;

/**
 * Created by ykro.
 */

@Singleton @Component(modules = {HashtagsModule.class, LibsModule.class, TwitterAppModule.class})
public interface HashtagsComponent {
    void inject(HashtagsFragment fragment);
    //ImagesPresenter getPresenter();
}

