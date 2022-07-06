package priya.in.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import priya.in.entity.DcIncome;

public interface IncomeRepo extends JpaRepository<DcIncome,Integer> {

}
