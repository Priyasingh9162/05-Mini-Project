package priya.in.rest;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import priya.in.bind.Child;
import priya.in.bind.kids;
import priya.in.entity.DcChild;
import priya.in.entity.DcEducation;
import priya.in.entity.DcIncome;
import priya.in.entity.DcPlan;
import priya.in.repo.ChildRepo;
import priya.in.repo.EducationRepo;
import priya.in.repo.IncomeRepo;
import priya.in.repo.PlanRepo;

@RestController
public class Controller {
	@Autowired
	private PlanRepo pr;
	@Autowired
	private IncomeRepo ir;
	@Autowired
	private EducationRepo er;
	@Autowired
	private ChildRepo cr;

	@PostMapping("/plan")
	public String plan(@RequestBody DcPlan plan) {
		DcPlan save = pr.save(plan);
		if (save != null)
			return "Plan data saved successfully!!";
		return "Failed to save plan data";
	}

	@PostMapping("/income")
	public String income(@RequestBody DcIncome income) {
		DcIncome save = ir.save(income);
		if (save != null)
			return "Income data saved successfully!!";
		return "Failed to save income data";
	}

	@PostMapping("/education")
	public String plan(@RequestBody DcEducation education) {
		DcEducation save = er.save(education);
		if (save != null)
			return "Education data saved successfully!!";
		return "Failed to save Education data";
	}

	@PostMapping("/child")
	public String child(@RequestBody Child childs) {
		List<kids> list = childs.getChilds();
		for (kids k : list) {
			DcChild c = new DcChild();
			BeanUtils.copyProperties(k, c);
			c.setCaseNo(childs.getCaseNo());
			cr.save(c);
		}
		return "child data saved successsfully";

	}

}
