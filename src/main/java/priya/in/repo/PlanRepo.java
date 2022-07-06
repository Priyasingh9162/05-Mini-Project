package priya.in.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import priya.in.entity.DcPlan;

public interface PlanRepo extends JpaRepository<DcPlan, Integer> {

}
