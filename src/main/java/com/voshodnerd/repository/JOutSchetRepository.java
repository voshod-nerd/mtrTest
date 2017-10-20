/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voshodnerd.repository;

import com.voshodnerd.entity.JOutSchet;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author Талалаев
 */
public interface JOutSchetRepository extends  JpaRepository<JOutSchet, Long> {
   List<JOutSchet> findByDataBetween(Date start, Date end);
}
