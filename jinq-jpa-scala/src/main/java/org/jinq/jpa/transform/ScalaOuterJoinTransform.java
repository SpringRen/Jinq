package org.jinq.jpa.transform;

import org.jinq.jpa.jpqlquery.RowReader;
import org.jinq.jpa.jpqlquery.ScalaTupleRowReader;

public class ScalaOuterJoinTransform extends OuterJoinTransform
{
   public ScalaOuterJoinTransform(JPQLQueryTransformConfiguration config)
   {
      super(config);
   }
   
   @Override
   protected <U> RowReader<U> createPairReader(RowReader<?> a, RowReader<?> b)
   {
      return ScalaTupleRowReader.createReaderForTuple(ScalaTupleRowReader.TUPLE2_CLASS, a, b);
   }
   
   @Override 
   public String getTransformationTypeCachingTag()
   {
      return ScalaOuterJoinTransform.class.getName();
   }
}
