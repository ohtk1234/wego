package org.zerock.wego.domain.info;

import lombok.Value;

@Value
public class SanInfodeVO {
	
   private Integer sanInfoId;// 산 정보 글 코드 시퀀스
   private Integer mountianCd;//산림청 산 코드
   private String sanName;//산 이름
   private String height;//산 높이
   private String address;//산 주소
   private String reason;//산 선정이유
   private String overview;//산 개관정보
   private String details;//산 설명
   private Integer lon;//경도
   private String lat;//위도
   private String img;//산 이미지
   private String weather;//날씨 이미지
   private Integer likeCnt;
   private String baseDate;//
   private String baseTime;//
   private String category;//
   private String fcstDate;//
   private String fcstTime;//
   private double fcstValue;//


//   private Integer baseDate;//자신이 조회하고 싶은 날짜
//   private Integer baseTime;//자신이 조회하고 싶은 시간대

}