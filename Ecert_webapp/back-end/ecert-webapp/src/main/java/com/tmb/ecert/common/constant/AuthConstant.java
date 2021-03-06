package com.tmb.ecert.common.constant;

public class AuthConstant {

	public static enum AUTHS {
		P0000200, // ยินดีต้อนรับ
		P0000300, // ตรวจสอบสถานะคำขอ
		P0000301, // แสดงรายละเอียด
		P0000400, // รายละเอียดบันทึกคำขอและพิมพ์แบบฟอร์มให้ลูกค้าลงนาม
		P0000401, // ดำเนินการชำระเงิน
		P0000402, // อนุมัติการชำระเงิน
		P0000403, // ปฏิเสธ
		P0000404, // พิมพ์ใบเสร็จ
		P0000405, // พิมพ์ใบนำส่งเอกสาร
		P0000406, // Upload Certificate
		P0000407, // ดาวน์โหลดใบคำขอหนังสือรับรองนิติบุคคลและหนังสือยินยอมให้หักเงินจากบัญชีเงินฝาก
		P0000408, // ดาวน์โหลดสำเนาบัตรประชาชน
		P0000409, // ดาวน์โหลดสำเนาใบเปลี่ยนชื่อหรือนามสกุล
		P0000410, // ดาวน์โหลดเอกสาร Certificate
		P0000500, // Request Form สำหรับลูกค้าทำรายการเอง
		P0000600, // Request Form สำหรับทำรายการให้ลูกค้าลงนาม
		P0000700, // รายงานสรุปการให้บริการ ขอหนังสือรับรองนิติบุคคล ( e-Certificate ) : End day
		P0000701, // Export to Excel
		P0000800, // รายงานสรุปการให้บริการ ขอหนังสือรับรองนิติบุคคล ( e-Certificate ) : Monthly
		P0000801, // Export to Excel
		P0000900, // รายงาน Output VAT
		P0000901, // Export to Excel
		P0001100, // Batch Monitoring
		P0001101, // Rerun
		P0001200, // Audit Log
		P0001201, // Export to Excel
		P0001300, // Role Manament
		P0001301, // เพิ่ม Role
		P0001302, // แก้ไข
		P0001303, // Import Role
		P0001304, // Export Role
		P0001400, // Parameter Configuration
		P0001401, // บันทึก
		P0001500, // Email Configuration
		P0001501, // แก้ไข
		P0001600 // แก้ไข
	}

}
