package cn.hayring.detecttool.domain;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
//import org.neo4j.ogm.annotation.GeneratedValue;
//import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;

import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;


@NodeEntity
@Data
public class Person extends Node {

    /**
     * neo4j çæçid
     */
    @Id
    @GeneratedValue
    private Long id;



    private String name;

    private String dob;

    private String identity;





    public Person() {
        // Empty constructor required as of Neo4j API 2.0.5
    };

    public Person(String name) {
        this.name = name;
    }

//    /**
//     * Neo4j doesn't REALLY have bi-directional relationships. It just means when querying
//     * to ignore the direction of the relationship.
//     * https://dzone.com/articles/modelling-data-neo4j
//     */
//    @Relationship(type = "OWN", direction = Relationship.DIRECTION)
//    public Set<Thing> things;





}