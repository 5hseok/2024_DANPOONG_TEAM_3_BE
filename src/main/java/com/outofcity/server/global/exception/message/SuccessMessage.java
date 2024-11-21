package com.outofcity.server.global.exception.message;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum SuccessMessage {


    SIGNUP_SUCCESS(HttpStatus.CREATED.value(),"회원가입에 성공하였습니다."),
    SIGNIN_SUCCESS(HttpStatus.CREATED.value(),"로그인에 성공하였습니다."),
    LOGOUT_SUCCESS(HttpStatus.OK.value(),"로그아웃에 성공하였습니다."),
    ACCOUNT_DELETION_SUCCESS(HttpStatus.OK.value(),"회원 탈퇴에 성공하였습니다."),
    MYPAGE_GET_SUCCESS(HttpStatus.OK.value(),"마이페이지 조회에 성공하였습니다."),
    ACTIVITY_LIKE_READ_SUCCESS(HttpStatus.OK.value(), "액티비티 찜 목록 조회에 성공하였습니다."),
    ACTIVITY_LIKE_ADD_SUCCESS(HttpStatus.CREATED.value(), "액티비티 찜에 성공하였습니다."),
    ACTIVITY_LIKE_DELETE_SUCCESS(HttpStatus.OK.value(), "액티비티 찜 취소에 성공하였습니다."),
    RESERVE_ACTIVITY_READ_SUCCESS(HttpStatus.OK.value(), "예약 액티비티 목록 조회에 성공하였습니다."),
    COMPLETED_ACTIVITY_READ_SUCCESS(HttpStatus.OK.value(), "체험 완료한 액티비티 목록 조회에 성공하였습니다."),;
    private final int code;
    private final String message;
}