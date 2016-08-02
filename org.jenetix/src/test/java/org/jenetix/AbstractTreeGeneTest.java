/*
 * Java Genetic Algorithm Library (@__identifier__@).
 * Copyright (c) @__year__@ Franz Wilhelmstötter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Author:
 *    Franz Wilhelmstötter (franz.wilhelmstoetter@gmx.at)
 */
package org.jenetix;

import org.jenetics.util.RandomRegistry;

/**
 * @author <a href="mailto:franz.wilhelmstoetter@gmx.at">Franz Wilhelmstötter</a>
 * @version !__version__!
 * @since !__version__!
 */
public class AbstractTreeGeneTest {

	private static final class TestTreeGene
		extends AbstractTreeGene<Integer, TestTreeGene>
	{
		TestTreeGene(final Integer value, final int... children) {
			super(value, children);
		}

		@Override
		public TestTreeGene newInstance() {
			return newInstance(RandomRegistry.getRandom().nextInt());
		}

		@Override
		public TestTreeGene newInstance(final Integer value) {
			return new TestTreeGene(value, _children);
		}
	}

}