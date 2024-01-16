package com.homeblog.Repository;

import com.homeblog.Entity.Home;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeRepository extends JpaRepository<Home,Long> {
}
