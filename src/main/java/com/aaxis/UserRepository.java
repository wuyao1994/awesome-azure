/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */

package com.aaxis;

import org.springframework.stereotype.Repository;

import com.microsoft.azure.spring.data.cosmosdb.repository.ReactiveCosmosRepository;

import reactor.core.publisher.Flux;

@Repository
public interface UserRepository extends ReactiveCosmosRepository<User, String> {

    Flux<User> findByFirstName(String firstName);

}
