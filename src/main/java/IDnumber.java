package hw0620;

public class IDnumber {
	public static String testID(String a) {
		String s = a;
		String checkHead = "ABCDEFGHJKLMNPQRSTUVWXYZIO"; // �r���N����Ӫ�
		if (s.length()==10){
			char[] c = s.toUpperCase().toCharArray();	// �إ� c �}�C�A�P�ɱNs�r����j�g��A�ন�r���}�C��J c �}�C
			int[] ID = new int [c.length];			// �إߤ@�ӹB��Ϊ���ư}�C�A�Ŷ��� c ���r���Ӽ�
			// ���ҭ���r���O�_�X�k (�Ӧr���O�_��bcheckHead[]���), ���ҲĤ@��O�_�� 1 or 2 (1=�k��, 2=�k��)
			if (checkHead.indexOf(c[0]) == -1 || (c[1] != '1' && c[1] != '2'))
				return "�榡���X�k";
			else{
				int sum=0;
				ID[0] = checkHead.indexOf(c[0])+10;	// �Ĥ@�ӭ^��r�B��
				sum+=ID[0]/10;				// .. �N�Ӽƥ[�` sum += ID[0]/10 
				ID[0]%=10;				// .. ���l�Ʃ�^ ID[0] �H�K���᪺�B��
				for (int i=1; i<10; i++)		// �N�����ҫ�9�X�ন��ƫ��A (ASCII�X-48)
					ID[i] = (int)c[i]-48;
				for (int i=0; i<9; i++){		// �N�J����:
					ID[i]*=(9-i);			// �`�M sum += (ID[0])*9 + ID[1]*8 + ID[2]*7 + ... + ID[9]*1
					sum+=ID[i];
				}
				// �ˬd(10-sum%10)�O�_�۵����ˬd�X�A�B sum%10(�l��)��0�ɡA�ˬd�X��0 => (10-sum%10)%10
				if ((10-sum%10)%10 == ID[9])
					return "�X�k";
				else
					return "���X�k";
			}
		}
		else
			return "���פ��X�k";
	}
	
}
