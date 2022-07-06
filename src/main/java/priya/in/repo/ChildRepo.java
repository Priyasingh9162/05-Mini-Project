package priya.in.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import priya.in.entity.DcChild;

public interface ChildRepo extends JpaRepository<DcChild,Integer> {

}
