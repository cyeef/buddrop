package edu.cnm.deepdive.capstone.buddrop.controllers;

import edu.cnm.deepdive.capstone.buddrop.entities.Transaction;
import java.util.List;
import org.apache.catalina.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "transaction", path = "transaction")
public interface TransactionController extends PagingAndSortingRepository<Transaction, Long> {

  List<Transaction> findByCardId(@Param("cardId") String cardId);

}
