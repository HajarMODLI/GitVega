package ma.morservs.vegaproject.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by Ayoub on 19/08/2016.
 */

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

   // @Autowired
    //private UserServiceDetail userService;

    //@Override
    //protected void configure(AuthenticationManagerBuilder registry) throws Exception {
    //    registry.userDetailsService(userService);
    //}
    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .csrf().disable();
        httpSecurity.authorizeRequests().antMatchers("/").permitAll();

    }

}
