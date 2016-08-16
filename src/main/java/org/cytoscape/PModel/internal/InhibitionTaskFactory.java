package org.cytoscape.PModel.internal;
import org.cytoscape.application.CyApplicationManager;
import org.cytoscape.model.CyEdge;
import org.cytoscape.model.CyNode;
import org.cytoscape.task.AbstractEdgeViewTaskFactory;
import org.cytoscape.task.EdgeViewTaskFactory;
import org.cytoscape.view.model.CyNetworkView;
import org.cytoscape.view.model.View;
import org.cytoscape.view.presentation.property.BasicVisualLexicon;
import org.cytoscape.work.AbstractTaskFactory;
import org.cytoscape.work.Task;
import org.cytoscape.work.TaskIterator;

//Class creates a task factory for the task ArrowShapeBypass to change an edge within a context menu.
public class InhibitionTaskFactory extends AbstractEdgeViewTaskFactory {
	
	private CyApplicationManager manny;
	
	public InhibitionTaskFactory(final CyApplicationManager manny) {
		this.manny = manny;
	}
	
	public TaskIterator createTaskIterator(View<CyEdge> edgeView, CyNetworkView netView) {
		// TODO Auto-generated method stub
		return new TaskIterator(new Task[] { new InhibitionShapeTask(edgeView, netView, manny.getCurrentNetwork()) });
	}

} //Build Task Factory for Finboolcol next