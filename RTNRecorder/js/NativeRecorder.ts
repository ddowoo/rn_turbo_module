import {TurboModule, TurboModuleRegistry} from 'react-native';

// 타입 지정
// 이름은 Spec로 지어야 한다.
export interface Spec extends TurboModule {
  //   record: Promise<string>;
  add: (a: number, b: number) => Promise<number>;
}

// 모듈 이름을 전달하고, 사용 가능한 경우 터보 네이티브 모듈을 가져옴
export default TurboModuleRegistry.get<Spec>('RTNRecorder') as Spec | null;
