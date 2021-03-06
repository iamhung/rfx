package rfx.sample.item.tracking;

import rfx.core.stream.functor.common.HttpEventLogTokenizing;
import rfx.core.stream.topology.BaseTopology;
import rfx.core.stream.topology.Pipeline;
import rfx.sample.item.tracking.functor.ItemLogParsingFunctor;


public class TrackingItemTopology extends BaseTopology  {

	@Override
	public BaseTopology buildTopology(){
		return Pipeline.create(this)
				.apply(HttpEventLogTokenizing.class)
				.apply(ItemLogParsingFunctor.class)		
				.done();
	}	
	
}
