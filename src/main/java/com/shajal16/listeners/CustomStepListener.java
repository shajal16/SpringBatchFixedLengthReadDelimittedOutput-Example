package com.shajal16.listeners;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

public class CustomStepListener implements StepExecutionListener {

	@Override
	public void beforeStep(StepExecution stepExecution) {
		System.out.println("StepExecutionListener - beforeStep");

	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		System.out.println("StepExecutionListener - afterStep");

		int readCount = stepExecution.getReadCount();
		int filterCount = stepExecution.getFilterCount();
		int commitCount = stepExecution.getCommitCount();
		int writeCount = stepExecution.getWriteCount();
		System.out.println("Total Steps "+writeCount);

		return stepExecution.getExitStatus();
		
	}

	/*@Override
	public void writeFooter(Writer writer) throws IOException {
		StepExecution stepExecution = null;
		writer.write("footer - number of items written: "+ stepExecution.getWriteCount());
	}*/
}