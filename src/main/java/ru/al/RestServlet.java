package ru.al;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the Employee service.
 */
@Controller
public class RestServlet {

    @RequestMapping(value = EmpRestURIConstants.GET_EMP, method = RequestMethod.GET)
    public @ResponseBody String getEmployee() {
        return "Test";
    }

    public class EmpRestURIConstants {

        public static final String DUMMY_EMP = "/rest/emp/dummy";
        public static final String GET_EMP = "/rest";
        public static final String GET_ALL_EMP = "/rest/emps";
        public static final String CREATE_EMP = "/rest/emp/create";
        public static final String DELETE_EMP = "/rest/emp/delete/{id}";
    }
}