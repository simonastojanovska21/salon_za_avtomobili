package com.example.salon_za_avtomobili.repository.viewRepository;

import com.example.salon_za_avtomobili.model.views.ProcentOdPromet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcentOdPrometRepository extends JpaRepository<ProcentOdPromet,Long> {
}
