package me.travisgray.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecipeController {

    @RequestMapping("/")
    public String showindex(){
        return "index";
    }

    @RequestMapping("/PumpkinRice")
    public String showpumpkinrice(){
        return "pumpkinrice";
    }


    @RequestMapping("/JerkChicken")
    public String showjerkchicken(){
        return "jerkchicken";
    }

    @RequestMapping("/CrabCake")
    public String showcrabcake(){
        return "crabcake";
    }

    @RequestMapping("/Injera")
    public String showInjera(){
        return "injera";
    }

    @RequestMapping("/Makroudh")
    public String showMakroudh(){
        return "makroudh";
    }

    @RequestMapping("/EggSauce")
    public String showEggSauce(){
        return "eggsauce";
    }

    @RequestMapping("/GulabJamun")
    public String showGulabJamun(){
        return "gulabjamun";
    }


    @RequestMapping("/Croquemadame")
    public String croquemadame(){
        return "croquemadame";
    }

    @RequestMapping("/Gallery")
    public String showGallery(){
        return "gallery1";
    }

    @RequestMapping("/Wings")
    public String showChineseWings(){
        return "wings";
    }

    @RequestMapping("/Bara")
    public String showBara(){
        return "bara";
    }

    @RequestMapping("/ShowFlagGallery")
    public String showFlag(){
        return "flaggallery";
    }

}
