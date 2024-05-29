package com.back.travelit.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Table(name = "USER")
@Entity
@Getter
@Setter
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /*private Integer USER_ID;
    private String LOGIN_ID;
    private String LOGIN_PWD;
    private String EMAIL;
    private String NICKNAME;
*/


    @Column(name = "USER_ID" )
    private Integer userID;
   

    @Column(name ="LOGIN_ID")
    private String loginID;
    @Column(name = "LOGIN_PWD" )
    private String loginPWD;

    @Column(name = "NICKNAME" )
    private String nickname;
    @Column(name = "ADMIN_YN" )
    private String adminYN;
    @Column(name = "PROFILE_NAME" )
    private String profileName;
    @Column(name = "PROFILE_SRC" )
    private String profileSrc;
    @Column(name = "CREATE_AT" )
    private Date createAt;
    @Column(name = "UPDATE_AT" )
    private Date updateAt;
    @Column(name = "INTRO" )
    private String intro;    //자기소개얔ㅋㅋㅋ


    @Column(name = "ROLE" )
    private String role;
    @Column(name = "EMAIL" )
    private String email;



    /*private Long id;


    private String username;
    private String name;

    private String email;

    private String role;*/
}


