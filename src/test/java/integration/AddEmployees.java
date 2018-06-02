package integration;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
    import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration()

//@ComponentScan(basePackageClasses = com.sat.controller.EmployeeController.class)

public class AddEmployees {
    @Autowired
    private WebApplicationContext wac;
    private MockMvc mockMvc;
    @Before
    public void setUp(){
       //   mockMvc= MockMvcBuilders.webAppContextSetup(this.wac).build();
          mockMvc= MockMvcBuilders.standaloneSetup(new com.sat.controller.EmployeeController()).build();

    }

    @Test
    public void giveUserSendTheRequest_whenEmployeeServiceInvoke_thenGetAllEmployees() throws Exception {
        mockMvc.perform(get("/employees"))
                                    .andExpect(status().isOk());
    }

}
