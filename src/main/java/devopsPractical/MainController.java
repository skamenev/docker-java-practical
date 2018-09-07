package devopsPractical;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;




@RestController
public class MainController {

    @Autowired
    DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public String getMySQLTime() {

        String result = jdbcTemplate.queryForObject("SELECT SYSDATE()", String.class);
        return result;

    }

    @RequestMapping("/time")
    public String index() {
        return getMySQLTime();
    }


}





