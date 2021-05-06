package com.yeonjae.jo.tgv_reservation_system.web;
import com.yeonjae.jo.tgv_reservation_system.web.dto.AcademyList;
import com.yeonjae.jo.tgv_reservation_system.web.dto.Organi;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {

    @GetMapping("/main")
    public String main1(Model model){
        Organi organi = new Organi(
                "1",
                "기관명",
                "기관설명",
                "로고url",
                "학원url",
                "10",
                "역삼역 또는 선릉역");
        AcademyList academyList = new AcademyList();
        academyList.setTotalCount(1);
        academyList.setOrgani(organi);
        model.addAttribute("curPage",1);
        model.addAttribute("totalPage",10);
        model.addAttribute("totalCount", 12);
        model.addAttribute("organi",organi);
        return "academy";
    }

    @GetMapping(value= {"/academyModify/getAcademy/{academyId}", "/academyModify/getAcademy/"})
    public String main2(@PathVariable(name="academyId", required = false) Integer academyId, Model model){
        if(academyId == null)
            return "academy_mod";
        System.out.println("main2" + academyId);
        Organi organi = new Organi(
                "1",
                "기관명",
                "기관설명",
                "로고url",
                "학원url",
                "10",
                "역삼역 또는 선릉역");

        model.addAttribute("academy", organi);
        System.out.println(">>>>> main2");
        return "academy_mod";
    }

}
