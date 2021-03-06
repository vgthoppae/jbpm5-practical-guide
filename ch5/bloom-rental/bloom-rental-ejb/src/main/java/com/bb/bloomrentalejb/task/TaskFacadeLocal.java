package com.bb.bloomrentalejb.task;

import java.util.List;
import javax.ejb.Local;
import com.bb.bloomrentaldomain.RentalTaskData;

@Local
public interface TaskFacadeLocal {
	public List<RentalTaskData> getAssignedTasks(String userId);

	public void completeTask(long taskId, boolean taskApproved,
			String taskComments);
}
