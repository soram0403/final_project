package com.mandu.yamyam.pro.mapper;

import java.util.List;
import java.util.Map;

import com.mandu.yamyam.comm.service.EmpVO;
import com.mandu.yamyam.pro.service.ProVO;

public interface ProMapper {
	
	/*---------------
	// 생산 계획 관리(관리탭)
	----------------*/
	
	// 생산계획 조회
	public List<ProVO> getPlan(ProVO vo);
	
	// 상세생산계획조회
	public List<ProVO> getPlanDetail(ProVO vo);
	
	// 상세생산계획 수정 (작업우선순위, 생산일자)
	public int updatePlanDetail(ProVO vo);
	
	// 상세생산계획 삭제
	public int deletePlanDetail(ProVO vo);
	
	// 생산계획 삭제
	public int deletePlan(ProVO vo);
	
	// 생산 요청서 업데이트(진행상황 : 미계획)
	public int updateBpod2(ProVO vo);
	
	// 생산계획 상세 개수
	public int detailCnt(ProVO vo);
	
	/*---------------
	// 생산 계획 관리(등록탭)
	----------------*/
	
	// 생산요청서 목록 조회
	public List<Map<String,Object>> orderList();
	
	// 제품목록 조회
	public List<Map<String,Object>> materialList();
	
	// 생산계획 등록
	public int insertPlan(ProVO vo);
	
	// 상세생산계획 등록
	public int insertPlanDetail(ProVO vo);

	
	// 생산 요청서 업데이트(진행상황 : 계획완료)
	public int updateBpod(ProVO vo);
	
	
	/*---------------
	// 생산 지시 관리
	----------------*/
	// 미지시 계획 조회
	public List<ProVO> noOrderList(ProVO vo);
	
	// 생산지시 일자 조회
	public int getPoddPrio(ProVO vo);
	
	// 생산라인 조회
	public List<Map<String,Object>> lineList(ProVO vo);
	
	// 필요자재 조회
	public List<ProVO> needM(ProVO vo);
	
	// 필요자재 lot 목록 조회
	public List<ProVO> mLotList(ProVO vo);
	
	// 생산지시 등록
	public int insertOrder(ProVO vo);
	
	// 상세생산지시 등록
	public int insertOrderDetail(ProVO vo);
	
	// 상세 생산계획 테이블 진행구분 업데이트(미지시 -> 지시완료)
	public int updatePplnd(ProVO vo);
	
	// 자재 입고 테이블 업데이트(재고 변경)
	public int updateMin(ProVO vo);
	
	// 실시간 생산공정을 기반으로 생산공정 이력을 생성(프로시저 사용)
	public int insertPRecord(ProVO vo);
	
	// 이력 테이블에 상세생산지시코드 업데이트
	public int updatesPRecord(ProVO vo);
	
	// 실시간 공정 테이블 비워주기
	public int resertPpro(ProVO vo);
	
	
	/*---------------
	// 생산 지시 조회
	----------------*/
	public List<ProVO> getOrderList(ProVO vo);
	
	
	/*---------------
	// 생산 관리
	----------------*/
	// 지시완료된 생산지시 조회
	public List<ProVO> getOProList(ProVO vo);
	
	// 제품 공정 목록 조회
	public List<ProVO> flowProgress(ProVO vo);
	
	// 생산공정 수정(투입량)
	public int updateProInAmt(ProVO vo);
	
	// 설비상태 수정(대기->가동)
	public int updateEqpSts(ProVO vo);

	// 제품 공정 목록 조회 (생산시작후)
	public List<ProVO> afterProgress(ProVO vo);
	
	// 완제품 재고 생성
	public int insertBIn(ProVO vo);
	
	
	/*---------------
	// 공정 실적 조회
	----------------*/
	public List<ProVO> getResultList(ProVO vo);
	
	// 에러코드 가져오기
	public List<ProVO> getErrorList();
	
	// 에러코드 업데이트
	public int updateError(ProVO vo);
	
	/*---------------
	// 공정 관리
	----------------*/
	public List<ProVO> getProList(ProVO vo);
	
	// 생산담당 직원 조회
	public List<EmpVO> getProEmpList();
	
	// 미사용 설비 조회
	public List<ProVO> noUseEqp();

	// 공정 등록
	public int insertProManage(ProVO vo);
	
	// 공정 삭제
	public int updateProManage(ProVO vo);
	
	// 공정 삭제
	public int deleteProManage(ProVO vo);
	
	/*---------------
	// 제품 공정 흐름도
	----------------*/
	// 제품 공정 흐름도 조회
	public List<ProVO> getFlowList(ProVO vo);
	
	// 제품 공정 흐름도 관리
	public List<ProVO> flowManage(ProVO vo);
	
	// 제품 공정 목록 조회
	public List<ProVO> viewProgress(ProVO vo);
	
	// 생산라인 저장
	public int insertPline(ProVO vo);
	
	// 생산공정 테이블 생산라인 업데이트
	public int updatePline(ProVO vo);
	
}
