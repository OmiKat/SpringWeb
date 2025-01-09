package com.example.SpringBootWeb1;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/") //this is mapping the home (this wasnt working because spring boot dont support -> so we convert the jsp file to servlet)
    //we add a dependency for that
    //this will be responsible to call index.jsp
    //see this is a controller so this will expect u to return a view tech
    public String home(){
        return "index";
    }

    //this is servlet way ro handle the request
//    @RequestMapping("add")
//    public String add(HttpServletRequest req , HttpSession session){
//
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//        int result = num1 + num2;
//        session.setAttribute("res",result);
////        System.out.println(result);
//               <h2>Result is : <%= session.getAttribute("res") %>    </h2> for jsp
//        return "Result.jsp";

//////////////////////////////////////////////////////////////////////////////////////////////

    //now lets see the spring way
//    @RequestMapping("add")
//    public String add(int num1 , int num2 , Model model){
//
//        int result = num1 + num2;
//       model.addAttribute("res",result);
//       return "Result"; //used application properties to remove the extension stuff

//////////////////////////////////////////////////////////////////////////////////////////////

        //MOdel and view
//    @RequestMapping("add")
//    public ModelAndView add(int num1 , int num2 , ModelAndView mv) {
//
//        int result = num1 + num2;
//        mv.addObject("res", result);
//        mv.setViewName("Result");
//        return mv;
//    }
    /////////////////////////////////////////////////////////////////////////////////////////


//    @RequestMapping("addAline")
//    public ModelAndView addAlien(@RequestParam("aid") int aid ,@RequestParam("aname") String aname , ModelAndView mv) {
//
//        Alien alien = new Alien();
//        alien.setAid(aid);
//        alien.setAname(aname);
//
//        mv.addObject("alien", alien);
//        mv.setViewName("Result");
//        return mv;
//    }

    //////////////////////////////////////////////////////////////////////////////////////////


    @RequestMapping("addAline")
    public String addAlien(@ModelAttribute Alien alien) {
        return "Result";
    }
}