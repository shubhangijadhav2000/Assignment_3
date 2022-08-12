package com.onboarding_ass4.repos;

import com.onboarding_ass4.model.Profile;
import com.onboarding_ass4.model.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ProfileRepo extends MongoRepository<Profile,Integer> {

    @Query("{requestId:?0}")
    List<Profile> findAllProfileByRequestId(String requestId);

    @Query("{resultId:?0}")
    Profile findProfileByResultId(String resultId);

}
