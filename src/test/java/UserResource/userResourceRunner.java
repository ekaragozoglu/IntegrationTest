package UserResource;

import com.intuit.karate.junit5.Karate;

class userResourceRunner {
    
    @Karate.Test
    Karate testUsers() {
        return Karate.run("filter").relativeTo(getClass());
    }    

}
